public class Function<T> implements Interface<T> {
    Node head;
    int size;

    //membuat list baru
    public Function() {
        this.head = null;
        this.size = 0;
    }

    //class node untuk menampung data
    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    //implementasi method dari class interface
    @Override
    public boolean isEmpty() {
        if (head == null)
            return true;
        else
            return false;
    }

    @Override
    public void addDepan(T data) {
        Node node = new Node(data);
        if (!isEmpty()) {
            node.setNext(head);
            head = node;
            size++;
        } else {
            head = node;
            size++;
        }
    }

    @Override
    public void addBelakang(T data) {
        Node node = new Node(data);
        if (!isEmpty()) {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
            size++;
        } else {
            head = node;
            size++;
        }
    }

    @Override
    public void addTengah(T data, int key) {
        Node node = new Node(data);
        Node temp = head;

        if (!isEmpty()) {
            if ( ((Siswa) temp.getData()).nis == (key) ) {
                while ( (((Siswa) temp.getData()).nis) != key ) {
                    temp = temp.getNext();
                }
                node.setNext(temp.getNext());
                temp.setNext(node);
                size++;
                System.out.println("Insert tengah berhasil!");
            } else {
                System.out.println();
                System.out.println("NIS " + key + " tidak terdaftar!");
                System.out.println("Gagal menambahkan data!");
            }
        } else {
            System.out.println("Maaf, data kosong!");
            System.out.println();
            size++;
        }
    }

    @Override
    public void deleteDepan() {
        if (!isEmpty()) {
            Node temp = head;
            head = head.getNext();
            temp.setNext(null);
            System.out.println("Delete depan berhasil!");
            size--;
        } else {
            System.out.println("Maaf, data kosong!");
        }
    }

    @Override
    public void deleteBelakang() {
        if (!isEmpty()) {
            Node temp, temp2;
            temp = head;
            temp2 = null;
            while (temp.getNext() != null) {
                temp2 = temp;
                temp = temp.getNext();
            }
            temp2.setNext(null);
            System.out.println("Delete belakang berhasil!");
            size--;
        } else {
            System.out.println("Maaf, data kosong!");
        }
    }

    @Override
    public void deleteTengah(int key2) {
        if (!isEmpty()) {
            Node temp, temp2;
            temp = head;
            temp2 = null;

            while ((((Siswa) temp.getData()).nis) != key2) {
                temp2 = temp;
                temp = temp.getNext();
            }

            temp2.setNext(temp.getNext());
            temp.setNext(null);
            size--;
            System.out.println("Delete tengah berhasil!");
        } else {
            System.out.println("maaf data kosong!");
        }
    }

    @Override
    public void deleteAll() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                temp = head.getNext();
                head.setNext(null);
            }
            head = null;
            size--;
            System.out.println("Hapus semua data berhasil!");
        } else {
            System.out.println("Maaf data kosong!");
        }
    }

    @Override
    public void tampilkan() {
        Node temp = head;
        if (!isEmpty()) {
            while (temp != null) {
                ((Siswa) temp.getData()).tampil();
                temp =temp.getNext();
            }
        } else {
            System.out.println("Maaf, data kosong!");
            System.out.println();
        }
    }

    @Override
    public void tampilJuara() {
        if (!isEmpty()) {
            Node temp = head;
            Siswa array[] = new Siswa[size];
            for (int i = 0; i < size; i++) {
                array[i] = ((Siswa) temp.getData());
                temp = temp.next;
            }
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (array[i].nilai >= array[j].nilai) {
                        Siswa swipe = array[i];
                        array[i] = array[j];
                        array[j] = swipe;
                    }
                }
            }
            for (int i = 0; i < size; i++) {
                System.out.println("Nama    : " + array[i].nama);
                System.out.println("NIS     : " + array[i].nis);
                System.out.println("Nilai   : " + array[i].nilai);
                System.out.println();
            }
        } else {
            System.out.println("Maaf data kosong!");
            System.out.println();
        }
    }
}