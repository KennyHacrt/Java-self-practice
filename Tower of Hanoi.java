public class Main {
    public static void main(String[] args) {
        int testing[]={
                1, 4, 7,2, 5, 10, 12, 20
        };
//        merge_sort(testing);
        for (int i:testing){
            System.out.println(i);
        }
        tower_of_hanoi(4);
    }
    public static void tower_of_hanoi(int times){
        start(times,0,2);
    }
    public static void start(int times,int from,int to){
        String position[]={"left","mid","right"};
        if (times<=1) {
            System.out.println("moved from "+position[from]+" to "+position[to]);
            return ;
        }
        int via= 3-from-to;
        start(times-1,from,via);
        System.out.println("moved from "+position[from]+" to "+position[to]);
        start(times-1,via,to);
    }
}
