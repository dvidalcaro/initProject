package createProject;

import java.io.File;

public class CreateProject {



    public CreateProject() {

    }

    public void projectArchive(String name, String[] structure){
      File f=  new File(name+"/src");
      f.mkdirs();
        System.out.println("Project created by file type");
        System.out.println(name);
        System.out.println("- " + "src");
      for (String structe:structure){
          new File(f.getPath()+"/"+structe).mkdir();
          System.out.println("  - " + structe );
      }
    }

    public void projectFunctions(String name , String[] structure){
        File f=  new File(name+"/src");
        f.mkdirs();
        System.out.println("Project was created for functionality");
        System.out.println("- "+name);
        System.out.println(" - " + "src");
        for (String structe:structure){
            new File(f.getPath()+"/"+structe).mkdir();
            System.out.println("  - " + structe );
        }
    }
    public void projectModule(String name , String[]modules, String[] structure){

        File f=  new File(name+"/src/modules");
        f.mkdirs();

        System.out.println(f.getPath());
        System.out.println("Project was created for modules");
        System.out.println("- "+name);
        System.out.println(" - " + "src");
        System.out.println("  - " + "modules");
         for(String module:modules){
            new File(f.getPath()+"/"+module).mkdir();
             System.out.println("   - " + module);
            for (String structe:structure){
                new File(f.getPath()+"/"+module+"/"+structe).mkdir();
                System.out.println("     - " + structe );
            }
        }

    }
}
