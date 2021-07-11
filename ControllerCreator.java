public class HelloWorld{

     public static void main(String []args){
         String[] classes = {"Test","Test1"} ;
         for (String s : classes){
             String ss=s+"s";
             String ls=s.substring(0, 1).toLowerCase() + s.substring(1);
             String lss=ls+"s";
             System.out.println("@Autowired\nprivate "+s+"Service "+ls+"Service;\n");
             System.out.println("@GetMapping\n"
                +"public List<"+s+"> getAll"+s+"() {\n"
                +"return "+ls+"Service.getAll"+ss+"();\n}\n");
		        
         
             System.out.println("@GetMapping(\"/{id}\")\n"
            +"public "+s+" get"+s+"(@PathVariable int id){\n"
		    +"return "+ls+"Service.get"+s+"(id);\n}\n");
		    
            System.out.println("@PostMapping\n"
            +"public void add"+s+"(@RequestBody "+s+" "+ls+") {\n"
		    +ls+"Service.add"+s+"("+ls+");\n}\n");
		    
		    System.out.println("@PutMapping\n"
		    +"public void update"+s+"(@RequestBody "+s+" "+ls+") {\n"
		    +ls+"Service.update"+s+"("+ls+");\n}\n");
		    
		    System.out.println("@DeleteMapping(\"/{id}\")\n"
            +"public void delete"+s+"(@PathVariable int id) {\n"
    		+ls+"Service.delete"+s+"(id);\n}\n");
		    System.out.println("------------------------------------------------");
		    //end
         }
     }
}
