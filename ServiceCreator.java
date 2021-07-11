public class ServiceCreator{

     public static void main(String []args){
         String[] classes = {"Test","Test1"} ;
         for (String s : classes){
             String ss=s+"s";
             String ls=s.substring(0, 1).toLowerCase() + s.substring(1);
             String lss=ls+"s";
             System.out.println("@Autowired\nprivate "+s+"Repository "+ls+"Repository;\n");
             System.out.println("public List<"+s+"> getAll"+ss+"() {\n"
                +"List<"+s+"> "+lss+" = new ArrayList<"+s+">();\n"
		        +ls+"Repository.findAll().forEach("+lss+"::add);\n"
	            +"return "+lss+";\n}\n");
         
             System.out.println("public "+s+" get"+s+"(int id){\n"
		    +"return "+ls+"Repository.findById(id).get();\n}\n");
		    
            System.out.println("public void add"+s+"("+s+" "+ls+") {\n"
		    +ls+"Repository.save("+ls+");\n}\n");
		    
		    System.out.println("public void update"+s+"("+s+" "+ls+") {\n"
		    +ls+"Repository.save("+ls+");\n}\n");
		    
		    System.out.println("public void delete"+s+"(int id) {\n"
		+ls+"Repository.deleteById(id);\n}\n");
		    System.out.println("------------------------------------------------");
		    //end
         }
     }
}
