import java.util.HashMap;

public class Commands {

    public static HashMap<String, String> windowsCommands = getWindowsCommands();
    public static HashMap<String, String> linuxCommands = getLinuxCommands();

    private static HashMap<String, String> getWindowsCommands(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("search", "\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\" google.se");
        map.put("open browser", "\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"");
        map.put("browser", "\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"");
        map.put("open mail", "\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\" gmail.se");
        map.put("email", "\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\" gmail.com");
        map.put("terminal", "\"D:\\Program Files\\Git\\git-bash.exe\" --cd-to-home");
        map.put("open terminal", "\"D:\\Program Files\\Git\\bin\\bash.exe\"");
        map.put("open manager", "explorer");
        map.put("file manager", "explorer");
        return map;
    }

    private static HashMap<String, String> getLinuxCommands(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("search", "google-chrome google.se");
        map.put("browser", "google-chrome");
        map.put("open mail", "google-chrome gmail.com");
        map.put("open email", "google-chrome gmail.com");
        map.put("terminal", "deepin-terminal");
        map.put("file manager", "explorer");
        return map;
    }
}
