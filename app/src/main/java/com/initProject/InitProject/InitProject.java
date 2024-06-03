package com.initProject.InitProject;

import createProject.CreateProject;
import picocli.CommandLine;
import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

import static picocli.CommandLine.Option;

@Command(
        name = "InitProject",
        mixinStandardHelpOptions = true,
        version = "0.0.1",
        description = "Initialize your project according to the following folder structure by file type, module-based or by functionality"

)
public class InitProject implements Callable<Integer> {
    private String [] archives= {"components", "styles", "scrips", "images", "fonts", "utils", "pages"};
    private String [] functions={"auth", "home", "cart", "products", "orders"};
    private String [] modules={"cart", "product"};
    private String [] moduleFolder= {"components", "services", "utils", "styles"};

    @Option(names = {"-c", "--create" },
    paramLabel = "name",
    required = true,
    description = "Create the project folder structures")
    private String name;
    @Option(names = {"-a", "--archive" },
            defaultValue = "false",
    description = "Create the project for Archive")
    private Boolean archive;
    @Option(names = {"-f", "--functions" },
            defaultValue = "false",
    description = "Create the project for functionality")
    private Boolean functionality;
    @Option(names = {"-m", "--modules" },
            defaultValue = "false",
    description = "Create the project for modules")
    private Boolean module;
    @Override
    public Integer call() throws Exception {

        CreateProject init= new CreateProject();



        if (archive){
            init.projectArchive(name, archives);
            return 0;
        }else if (functionality){
            init.projectFunctions(name, functions);

        }else  if (module){
            init.projectModule(name, modules, moduleFolder);

        }else{
            System.out.println("Error no selected options validate");
        }





        return 0;



    }

    public static void main(String[] args) {
        int exiCode = new CommandLine(new InitProject()).execute(args);
        System.exit(exiCode);

    }


}
