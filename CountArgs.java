public class CountArgs {
    public static void main(String[] args){
        System.out.println("Total number of commandline argument:"+args.length);
        for(int i = 0; i <args.length;i++){
            System.out.println("Argument"+(i+1)+":"+args[i]);
        }
    }
    
}
