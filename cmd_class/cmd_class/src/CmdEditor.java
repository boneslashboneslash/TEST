
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lukas.soucek
 */
public class CmdEditor implements CmdInterface {

    private File actualDir;
    private Command command;
    private Parser parser = new Parser();

    public CmdEditor() {
        actualDir = new File(System.getProperty("user.dir"));

    }

    @Override
    public String getActualDir() {
        return actualDir.getAbsolutePath();
    }

    @Override
    // vykonání daného příkazu
    public String execute(String command) {
        // rozdeleni pomoci parseru
        this.command = parser.parse(command);
        this.command.run(actualDir);
         actualDir = this.command.getNewDir();
        // získáme znění příkazu

        return this.command.getText();

    }

}
