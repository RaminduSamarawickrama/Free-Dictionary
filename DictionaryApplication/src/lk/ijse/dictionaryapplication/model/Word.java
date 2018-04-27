/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dictionaryapplication.model;

/**
 *
 * @author nethm
 */
public class Word {
    private String word;
    private String word_type;
    private String word_definition;

    public Word() {
    }

    public Word(String word, String word_type, String word_definition) {
        this.word = word;
        this.word_type = word_type;
        this.word_definition = word_definition;
    }

    /**
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * @param word the word to set
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * @return the word_type
     */
    public String getWord_type() {
        return word_type;
    }

    /**
     * @param word_type the word_type to set
     */
    public void setWord_type(String word_type) {
        this.word_type = word_type;
    }

    /**
     * @return the word_definition
     */
    public String getWord_definition() {
        return word_definition;
    }

    /**
     * @param word_definition the word_definition to set
     */
    public void setWord_definition(String word_definition) {
        this.word_definition = word_definition;
    }
    
}
