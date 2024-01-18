// Programın başlangıç noktası
public class Main {
    public static void main(String[] args) {
        AvlTree tree = new AvlTree(); // AVL Tree nesnesi oluşturuluyor

        // Düğümler ekleniyor
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);

        int searchKey = 30; // Arama için bir anahtar değeri seçiliyor
        // Arama yapılıyor ve sonuç ekrana yazdırılıyor
        if (tree.search(tree.root, searchKey))
            System.out.println(searchKey + " AVL Tree'de bulundu.");
        else
            System.out.println(searchKey + " AVL Tree'de bulunamadı.");
    }
}
