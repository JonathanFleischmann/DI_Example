package com.implementation_example.console_logger_list_alternative.logger_services;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ColorfulWordsConsoleLoggerService implements LoggerService {

    @Override
    public void log(String message) {
        // Teile den String in Wörter auf, spalte dabei auch Satzzeichen ab
        List<ColoredWord> coloredWordList = getWords(message);
        // Färbe die Wörter zufällig ein
        colorWords(coloredWordList);
        // Baue den farbigen String zusammen
        String coloredMessage = buildColoredMessage(coloredWordList);
        System.out.println("\nColorful Words Logger: " + coloredMessage);
    }

    private List<ColoredWord> getWords(String message) {
        String[] words = message.split(" ");
        List<ColoredWord> coloredWordList = new ArrayList<>();
        for (String word : words) {
            if (word.matches(".*[.,!?;:]")) {
                coloredWordList.add(new ColoredWord(word.replaceAll("[.,!?;:]", ""), WordType.PUNCTUATION));
                coloredWordList.add(new ColoredWord(word.replaceAll("[^.,!?;:]", ""), WordType.WORD));
            } else {
                coloredWordList.add(new ColoredWord(word, WordType.WORD));
            }
        }
        return coloredWordList;
    }

    private void colorWords(List<ColoredWord> wordList) {
        for (ColoredWord word : wordList) {
            word.setColor(Color.getRandomColorButReset());
        }
    }

    private String buildColoredMessage(List<ColoredWord> coloredWordList) {
        StringBuilder coloredMessage = new StringBuilder();
        for (ColoredWord coloredWord : coloredWordList) {
            if (coloredWord.getType() == WordType.WORD) {
                coloredMessage.append(coloredWord.getColor().getCode()).append(coloredWord.getWord()).append(" ");
            } else {
                coloredMessage.append(coloredWord.getColor().getCode()).append(coloredWord.getWord());
            }
        }
        coloredMessage.append(Color.RESET.getCode());
        return coloredMessage.toString();
    }
}

enum WordType {
    WORD,
    PUNCTUATION
}

class ColoredWord {
    private final String word;
    private final WordType type;
    private Color color;

    public ColoredWord(String word, WordType type) {
        this.word = word;
        this.type = type;
    }

    public String getWord() {
        return word;
    }

    public WordType getType() {
        return type;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
