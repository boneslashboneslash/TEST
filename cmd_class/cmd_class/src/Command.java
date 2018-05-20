
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
public abstract class Command {

    // parametry pole odtrzeného od príkazu

    protected String[] parameters;
    protected File newDir;
    protected String resultText;

    /**
     *
     * @param dir
     */
    public abstract void run(File dir);

    public void setParameters(String [] parameters)
    {
        this.parameters = parameters;
    }
     
    public File getNewDir() {
        return newDir;
    }

    public String getText() {
        return resultText;
    }
}
