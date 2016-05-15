/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 *
 * @author mohamed
 */
public class Speak {

    private static final String VOICENAME = "kevin16";
    private String ch;

    public Speak() {
    }

    public void talk(String ch) {
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice(VOICENAME);
        voice.allocate();
        try {
            voice.speak(ch);
        } catch (Exception e) {
        }
    }
}
