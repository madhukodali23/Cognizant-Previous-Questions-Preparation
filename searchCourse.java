
class Main {
    public static String searchCourse(int n, String courseNames, String search) {
        if (n <= 0 || n > 20){
            return "Invalid";
        }
        String names[] = courseNames.split(" ");
        for(int i=0;i<names.length;i++)
        {
            String name = names[i].toLowerCase();
            if (name.equals(search.toLowerCase()))
            {
                return names[i];
            }
        }
        return "";
    }
    public static void main(String[] args) {
        int n = 20;
        String courseNames = "Java Oracle C++ Mysql Dotnet";
        String search = "C++";
        System.out.println(searchCourse(n, courseNames, search));
    }
}
