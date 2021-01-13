package servicii;

import Exceptii.ProductNotFoundException;
import Exceptii.ValidationFailedExeption;
import models.Offer;

import java.util.ArrayList;
import java.util.List;

public interface OfferServiceImpl extends OferService{
     List<Offer> offers = new ArrayList<>();

    default Offer create(Offer offer) throws ValidationFailedExeption{
        if(offer.getCustomer() != null && offer.getTotal() > 0){
            return new Offer(offer.getCustomer() , offer.getProducts(),offer.getTotal());
        }else{
            throw new ValidationFailedExeption();
        }
    }
    default List<Offer> search(String s){
        List<Offer> offerList = new ArrayList<>();
        for(Offer o: offers){
            if(o.getCustomer().contains(s)){
                offerList.add(o);
            }
        }
        return offerList;
    }
    default boolean delete (Offer offer) throws ProductNotFoundException{
        if(offer != null && offer.getCustomer() != null) {
            if (offers.contains(offer)) {
                offers.remove(offer);
                return true;
            } else {
                throw new ProductNotFoundException("Nu exista in lista");
            }
        }
        return false;
    }

    default void setOffers(List<Offer> offerList){
        offers.addAll(offerList);
    }

    default List<Offer> findAllByProductName(String s){
        List<Offer> offersList = new ArrayList<>();
        for(Offer o : offers ){
            if(o.getProducts().equals(s)){
                offersList.add(o);
            }
        }
        return offersList;
    }
}
