public class AplikasiTodolist {

    public static String[] model = new String[10];

    public static void main(String[] args) {
        testShowTodoList();
    }

    public static void showTodoList(){
        for (var i=0; i< model.length ; i++){
            var todo :todo String = model[i];
            var no = i + 1;
            System.out.println(no);
            if (todo != null){
                System.out.println(no+ ". " + todo);
            }
        }
    }
    public static void testShowTodoList(){
        String[] model = {"belajar java", "mencuci", "main ps"};
        showTodoList();
    }

    public static void addTodoList(){

    }

    public static void removeTodoList(){

    }

    /**
     * For View
     */

    public static void viewShowTodoList(){

    }

    public static void viewAddTodoList(){

    }


    public static void viewRemoveTodoList(){
        
    }

}
