/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projfinalcursoemvideo;

/**
 *
 * @author alexs
 */
public class View {
    private Student viewer;
    private Video video;

    public View(Student viewer, Video video) {
        this.viewer = viewer;
        this.video = video;
        viewer.watchOneMore();
        video.setViews(video.getViews()+1);
    }
    
    

    public void review(){
        System.out.println(viewer.getName() + " avaliou o video " + video.getTitle()); 
        this.video.setRate(5);
    }
    
    public void review(int review){
        System.out.println(viewer.getName() + " avaliou o video " + video.getTitle() + " como " + review + " estrelas ");
        this.video.setRate(review);
    }
    
    public void review(float review){
        int total = 0;
        if(review <= 20){
            total = 3;
        } else if(review >20 && review <= 50){
            total = 5;
        } else if (review <= 90){
            total = 8;
        } else{
            total = 10;
        }
        this.video.setRate(total);
        System.out.println(viewer.getName() + " avaliou o video " + video.getTitle() + " como sendo " + review + "% satisfatorio \n"
                            + this.video.getRate() + " estrelas ");
        
    }
    
    public Student getViewer() {
        return viewer;
    }

    public void setViewer(Student viewer) {
        this.viewer = viewer;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "View{" + "viewer=" + viewer + ", video=" + video + '}';
    }
    
    
    
}
