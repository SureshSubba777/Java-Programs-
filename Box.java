class Volume{
    private int l;
    private int b;
    private int h;

    public void setvalue(int x, int y, int z){
        l= x;
        b =y;
        h = z;
    }
    public int findvolume(){
        return l*b*h;
    }
}



public class Box {
    public static void main(String[] args) {
        Volume b =new Volume();
        b.setvalue(1, 2, 3);
        int v = b.findvolume();
        System.out.println("Volume: "+v);

    }
}
