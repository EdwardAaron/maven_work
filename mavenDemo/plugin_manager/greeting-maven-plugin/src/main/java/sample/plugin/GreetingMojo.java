package sample.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * 对应一个goal
 */
@Mojo(name = "sayhi")
public class GreetingMojo extends AbstractMojo {
    //@Parameter(property = "sayhi.greeting", defaultValue = "Hello World!") 也可以
    //@Parameter 也可
    @Parameter(property = "greeting", defaultValue = "Hello World!")
    private String greeting;

    public void execute() throws MojoExecutionException {
        getLog().info(greeting);
    }
}
