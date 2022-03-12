package DesignPatterns.CreationalDesignPattern.PrototypeDP.Example2;

import java.util.ArrayList;
import java.util.List;

public class Client {

//    1. Read a list of string
//    a4_rule_120
//    a4_plain_120
//    a3_plain_120
//    2. Based upon the type of strings create relevant objects
//    3. Add a random Front and fact page to it.

    public static void main(String[] args) {
        NotebookRegistry notebookRegistry = new NotebookRegistry();

        notebookRegistry.registerNotebook("a4_rule_120",
                new Notebook(
                PageType.A4,
                120,
                RuleType.RULED
        ));

        notebookRegistry.registerNotebook("a4_plain_120",
                new Notebook(
                        PageType.A4,
                        120,
                        RuleType.PLAIN
                ));

        notebookRegistry.registerNotebook("a3_plain_120",
                new Notebook(
                        PageType.A3,
                        120,
                        RuleType.PLAIN
                ));

        List<String> input = List.of(
                "a4_rule_120",
                "a4_rule_120",
                "a4_rule_120",
                "a3_plain_120",
                "a4_rule_120",
                "a4_rule_120"
        );

        List<Notebook> notebooks = new ArrayList<>();

        for (String inp : input) {
            Notebook prototype = notebookRegistry.getNotebook(inp);
            if (prototype == null)
                continue;
            prototype.setFactPage(new FactPage());
            prototype.setFrontPage(new FrontPage());

            notebooks.add(prototype);
        }
    }






}
