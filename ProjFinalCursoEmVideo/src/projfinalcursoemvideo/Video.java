/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projfinalcursoemvideo;

/**
 *
 * @author alexs
 */
public class Video implements VideoActions{
    private String title;
    private double rate;
    private int views;
    private int likes;
    private boolean playing;

    public Video(String title) {
        this.setTitle(title);
        this.setLikes(0);
        this.setPlaying(false);
        this.setRate(0);
        this.setViews(0);
        this.setRate(0);
    }

    
    
    @Override
    public void play() {
        this.setPlaying(true);
        System.out.println("Reproduzindo");
    }

    @Override
    public void pause() {
        this.setPlaying(false);
        System.out.println("Pausado");
    }

    @Override
    public void like() {
        this.setLikes(this.getLikes()+1);
        System.out.println("Voce deixou um like!");
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(int rate) {
        int newRate;
        newRate = (int) ((this.rate + rate)/this.views);
        this.rate = newRate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    @Override
    public String toString() {
        return "Video{" + "title=" + title + ", rate=" + rate + ", views=" + views + 
                ", likes=" + likes + ", playing=" + playing + '}';
    }
    
    
    
    
}
