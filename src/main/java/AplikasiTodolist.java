public class AplikasiTodolist {

    public static String[] model = new String[10];
    public static java.util.Scanner scanner =  new java.util.Scanner(System.in);


    public static void main(String[] args) {
        viewShowTodoList();

    }

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        String name = input("Nama");
        System.out.println("Halo " + name);

        String jobs  = input("Jobs");
        System.out.println("Jobs" + jobs);
    }



    public static void showTodoList(){
        System.out.println("TODO LIST:");
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
            for (int i = number-1; i < model.length; i++) {
                //set when End queque to null
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

        while (true){
            showTodoList();

            System.out.println("Menu : ");
            System.out.println("1. Tambah ");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");
            String input = input("Pilih");

            if (input.equals("1")) {
                viewAddTodoList();
            } else if (input.equals("2")){
                viewRemoveTodoList();
            } else if(input.equals("x")){
                break;
            }else {
                System.out.println("perintah tidak ditemukan!!!");
            }
        }
    }
    public static void testViewShowTodoList(){
        for (int i = 1; i < 4; i++) {
            addTodoList("add todo list "+i);
        }
        viewShowTodoList();

    }


    public static void viewAddTodoList(){
        System.out.println("Tambah TodoList(x jika batal):");
        String todo = input("Task: ");
        if (todo.equals("x")) {
            //batal
        }else {
            addTodoList(todo);
        }
    }
    public static void testViewAddTodoList(){
        for (int i = 0; i < 4; i++) {
            addTodoList("add todo list "+i);
        }
        viewAddTodoList();
        showTodoList();
    }

    public static void viewRemoveTodoList(){
        System.out.println("Hapus urutan(x jika batal)");
        String number = input("Task ke ");
        if (number.equals("x")) {
            //batal
        }else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if (!success){
                System.out.println("gagal menghapus todolist urutan:" + number);
            }
        }
    }
    public static void testViewRemoveTodoList(){
        for (int i = 0; i < 4; i++) {
            addTodoList("add todo list "+i);
        }
        showTodoList();
        viewRemoveTodoList();
        showTodoList();
    }

}
