public class CommmandArgs {
    public static void main(String[] args){
        if(args.length == 2){
            System.out.println("The command line argument are:");
            for(int i = 0 ; i<args.length;i++){
                System.out.println("Argument" + (i+1)+";"+args[i]);
            }
        }else{
            System.out.println("Enter only two command line argument.");
        }

    }
}
