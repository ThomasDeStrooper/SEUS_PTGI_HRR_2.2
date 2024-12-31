import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GemSpecification {
    private String name = "github-linguist";
    private String version = System.getenv("GEM_VERSION") != null ? System.getenv("GEM_VERSION") : "1.0.0"; // Replace "1.0.0" with a default version.
    private String summary = "GitHub Language detection";
    private String description = "We use this library at GitHub to detect blob languages, highlight code, ignore binary files, suppress generated files in diffs, and generate language breakdown graphs.";
    private String authors = "GitHub";
    private String homepage = "https://github.com/github-linguist/linguist";
    private String license = "MIT";
    private Map<String, String> metadata = new HashMap<>();
    private List<String> files = new ArrayList<>();
    private String platform = "RUBY";
    private List<String> executables = new ArrayList<>();
    private List<String> extensions = new ArrayList<>();
    private List<String> requirePaths = new ArrayList<>();
    private Map<String, String> dependencies = new HashMap<>();

    public GemSpecification() {
        metadata.put("github_repo", "ssh://github.com/github-linguist/linguist");
        files.add("lib/**/*");
        files.add("ext/**/*");
        files.add("grammars/*");
        files.add("LICENSE");
        executables.add("github-linguist");
        executables.add("git-linguist");
        extensions.add("ext/linguist/extconf.rb");
        requirePaths.add("lib");
        requirePaths.add("ext");
        dependencies.put("cgi", ">= 0");
        dependencies.put("charlock_holmes", "~> 0.7.7");
        dependencies.put("mini_mime", "~> 1.0");
    }

    // Example of printing the specification details
    public void printSpec() {
        System.out.println("Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Summary: " + summary);
        System.out.println("Description: " + description);
        System.out.println("Authors: " + authors);
        System.out.println("Homepage: " + homepage);
        System.out.println("License: " + license);
        System.out.println("Metadata: " + metadata);
        System.out.println("Files: " + files);
        System.out.println("Platform: " + platform);
        System.out.println("Executables: " + executables);
        System.out.println("Extensions: " + extensions);
        System.out.println("Require Paths: " + requirePaths);
        System.out.println("Dependencies: " + dependencies);
    }

    public static void main(String[] args) {
        GemSpecification spec = new GemSpecification();
        spec.printSpec();
    }
}
