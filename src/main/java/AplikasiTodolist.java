public class AplikasiTodolist {

    public static String[] model = new String[2];

    public static void main(String[] args) {
//        testShowTodoList();
        testAddTodoList();
    }

    public static void showTodoList(){
        for (int i=0; i< model.length ; i++){
            String todo = model[i];
            int no = i + 1;
            if (todo != null){
                System.out.println(no+ ". " + todo);
            }
        }
    }
    public static void testShowTodoList(){
        model[0] = "belajar java";
        model[1] = "bermain ";
        showTodoList();
    }

    public static void addTodoList(String todo){
        //check model is full
        Boolean isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                isFull=false;
                break;
            }
        }
        //change capacity model *2
        if(isFull){
            String[] temp = model;
            model = new String[model.length*2];

            for (int i = 0; i < temp.length ; i++) {
                model[i] = temp[i];
            }
        }
        
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList(){
        for (int i = 0; i < 4; i++) {
            addTodoList("add todo list "+i);
        }
        showTodoList();
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
