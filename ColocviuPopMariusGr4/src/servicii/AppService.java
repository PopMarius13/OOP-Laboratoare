package servicii;

import Exceptii.ValidationFailedExeption;

import java.util.List;

public interface AppService <T> extends OferService{
    public T create (T t) throws ValidationFailedExeption;
    public List<T> search(String s);
    public boolean delete(T t);
}
