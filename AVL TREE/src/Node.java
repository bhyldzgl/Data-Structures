// AVL Tree düğümlerini temsil eden sınıf
class Node {
    int key; // Düğümün değeri
    int height; // Düğümün yüksekliği (root düğümlerle birlikte AVL dengelemesini sağlamak için)
    Node left, right; // Sol ve sağ çocuk düğümler
    // Yapıcı (constructor) fonksiyon, bir düğüm oluşturur ve değeri ayarlar
    Node(int key) {
        this.key = key;
        this.height = 1; // Yeni düğüm eklediğimizde yükseklik 1 olarak ayarlanır
    }
}
