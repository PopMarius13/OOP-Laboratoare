package servicii;

import models.Offer;

import java.util.List;

public interface OferService {
      List<Offer> findAllByProductName(String s);
}
