package s;

public class Main {

    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();

       cocheCrud.delete();
       cocheCrud.findall();
       cocheCrud.save();
    }
}
