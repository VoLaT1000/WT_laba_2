package by.bsuir.kugach.wt_laba_2.dao.classes;

public class DAOException extends Exception{
    public DAOException(){
        super();
    }
    public DAOException(String message){
        super();
    }
    public DAOException(Exception e){
        super(e);
    }
    public DAOException(String message, Exception e){
        super(message, e);
    }
}
