public class Main {
    public static void main(String[] args) {
        Dynamic_array array=new Dynamic_array();
        array.dynm();
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        array.add("F");
        array.print();
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------



public class Dynamic_array {
    int capacity=10;
    Object dynam_array[];
    int size;
    public void dynm(){
        this.dynam_array =new Object[capacity] ;
    }
    public void dynm(int cap){
        this.capacity=cap;
        this.dynam_array =new Object[capacity];
    }
    public void add(Object element){
        this.dynam_array[size]=element;
        this.size++;
        if (this.size>this.capacity/2){
            grow();
        }
    }
    public void delete(Object element){
        int index=search(element);
        Object array[]= new Object[capacity];
        if (index!=-1){
            for (int i=0;i<size;i++){
                if (i==index){
                    continue;
                }
                else if (i>index){
                    array[i-1]=dynam_array[i];
                }
                else{
                    array[i]=dynam_array[i];
                }
            }
            this.dynam_array=array;
            this.size--;
            if (this.size>this.capacity/3){
                shrink();
            }
        }

    }
    public void insert(Object element,int index){
        Object array[]=new Object[capacity];
        size++;
        if (this.size>this.capacity/2) {
            grow();
        }

        for (int i=0;i<size;i++){
            if (i==index){
                array[i]=element;
            }
            else if (i>index){
                array[i]=dynam_array[i-1];
            }
            else{
                array[i]=dynam_array[i];
            }
        }
        this.dynam_array=array;
    }
    public int search(Object element){
        for (int i=0; i<this.size;i++){
            if (this.dynam_array[i]==element){
                return i;
            }
        }
        System.out.println(element+" not found");
        return -1;
    }
    private void grow(){
        this.capacity+=size;
        Object array[]=new Object[this.capacity];
        for (int i=0; i<this.size;i++){
            array[i]=dynam_array[i];
        }
        dynam_array=array;
    }
    private void shrink(){
        this.capacity-=size;
        Object array[]=new Object[this.capacity];
        for (int i=0; i<this.size;i++){
            array[i]=dynam_array[i];
        }
        dynam_array=array;
    }
    public void print(){
        for (Object i : dynam_array){
            System.out.println(i);
        }
    }
    public boolean isEmpty(){
        return size==0;
    }
}
