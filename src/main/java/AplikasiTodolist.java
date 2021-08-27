public class AplikasiTodolist {

    public static String[] model = new String[2];

    public static void main(String[] args) {
//        testShowTodoList();
//        testAddTodoList();
        testRemoveTodoList();
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

    public static boolean removeTodoList(Integer number){
        if((number-1) >= model.length){
            return false;
        }else if(model[number-1] == null){
            return false;
        } else {
            //reorder when delete
            //01
            //12- 2-1
            //23
            for (int i = number-1; i < model.length; i++) {
                if(i == (model.length-1)){
                    model[i]=null;
                } else{
                    model[i] = model[i+1];
                }
            }

           return true;
        }
    }

    public static void testRemoveTodoList() {
        for (int i = 1; i < 4; i++) {
            addTodoList("add todo list "+i);
        }
//        showTodoList();
//        System.out.println("^hasil penambahan^");
        Boolean result;
//        result = removeTodoList(20);
//        System.out.println(result);
//        result = removeTodoList(5);
//        System.out.println(result);
//        result = removeTodoList(3);
//        System.out.println(result);

        result = removeTodoList(1);
        showTodoList();
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
