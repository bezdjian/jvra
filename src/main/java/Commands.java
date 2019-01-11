import java.util.HashMap;

public class Commands {

    public static HashMap<String, String> windowsCommands = getWindowsCommands();
    public static HashMap<String, String> linuxCommands = getLinuxCommands();

    private static HashMap<String, String> getWindowsCommands(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("search", "\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\" google.se");
        map.put("open browser", "\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"");
        map.put("open mail", "\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\" gmail.se");
        map.put("terminal", "\"D:\\Program Files\\Git\\bin\\bash.exe\"");
        map.put("open terminal", "\"D:\\Program Files\\Git\\bin\\bash.exe\"");
        map.put("open manager", "explorer");
        return map;
    }

    private static HashMap<String, String> getLinuxCommands(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("search", "google-chrome google.se");
        map.put("browser", "google-chrome");
        map.put("open mail", "google-chrome gmail.se");
        map.put("terminal", "terminal");
        map.put("file manager", "explorer");
        return map;
    }
}
