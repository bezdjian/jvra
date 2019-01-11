import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import org.apache.log4j.Logger;

import java.io.IOException;

public class JVRA {

    private static Logger LOGGER = Logger.getLogger(JVRA.class);

    public static void main(String[] args) {
        LOGGER.info("Starting JVRA...\n");

        try {
            //Configuration Object
            Configuration configuration = new Configuration();

            // Set path to the acoustic model.
            configuration.setAcousticModelPath("lib/en-us");

            // Set path to the dictionary.
            configuration.setDictionaryPath("lib/jvra.dic");

            // Set path to the language model.
            configuration.setLanguageModelPath("lib/jvra.lm");

            //Recognizer object, Pass the Configuration object
            LiveSpeechRecognizer recognize = new LiveSpeechRecognizer(configuration);

            //Start Recognition Process (The bool parameter clears the previous cache if true)
            recognize.startRecognition(true);

            //Creating SpeechResult object
            SpeechResult result;

            String os = System.getProperty("os.name").toLowerCase();
            LOGGER.info("OS Name: " + os);

            //Check if recognizer recognized the speech
            while ((result = recognize.getResult()) != null) {
                //Get the recognized speech
                String command = result.getHypothesis();
                String work = null;
                Process p;

                if(os.contains("windows")){
                    LOGGER.info("OS is " + os + " and command is " + command);
                    work = Commands.windowsCommands.get(command.toLowerCase());
                }else if(os.contains("linux")){
                    LOGGER.info("OS is " + os + " and command is " + command);
                    work = Commands.linuxCommands.get(command.toLowerCase());
                }else{
                    LOGGER.info("ELSE OS is " + os + " and command is " + command);
                }
                LOGGER.info("Work is " + work);

                if (work != null) {
                    LOGGER.info("--- Running command " + work);
                    try {
                        p = Runtime.getRuntime().exec(work);

                    } catch (IOException e) {
                        //e.printStackTrace();
                        LOGGER.error("Cannot run the command " + work + ", Reason: " + e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            //e.printStackTrace();
            LOGGER.error("In IOExeption: " + e.getMessage());
        }
    }
}
