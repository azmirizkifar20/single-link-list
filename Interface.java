public interface Interface<T> {
    public boolean isEmpty();

    public void addDepan(T data);
    public void addBelakang(T data);
    public void addTengah(T data, int key);

    public void deleteDepan();
    public void deleteBelakang();
    public void deleteTengah(int key2);
    public void deleteAll();

    public void tampilkan();
    public void tampilJuara();
}