/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GradProject;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Okadante
 */
public class Mainmth {

    public static void main(String[] args) {
        ImageIcon Nar = new ImageIcon("Naruto.Jpg");
        ImageIcon NJ = new ImageIcon("NinjaScroll.Jpg");
        ImageIcon MH = new ImageIcon("MyHero.Jpg");
        ImageIcon OP = new ImageIcon("OnePunchMan.Jpg");
        ImageIcon DZ = new ImageIcon("DBZ.Jpg");
        ImageIcon IN = new ImageIcon("Inuyasha.Jpg");
        ImageIcon SAO = new ImageIcon("SAO.Jpg");
        ImageIcon HC = new ImageIcon("Howls.Jpg");
        String Z;
        String A;
        String B;
        String C;
        String D;
        String E;
        
        JOptionPane.showMessageDialog(null, "Welcome to Dante's Anime suggestor");

        do {
            do {
                A = JOptionPane.showInputDialog("Do you prefer straight action or action with a bit of romance?(Please Answer a or r)");
                if (!"a".equals(A) && !"r".equals(A)) {
                    JOptionPane.showMessageDialog(null, "Please answer 'a' or 'r'");
                }
            } while (!"a".equals(A) && !"r".equals(A));
            if ("a".equals(A)) {
                do {
                    B = JOptionPane.showInputDialog("Do you prefer ninjas or heroes?(please answer n or h or neither)");
                    if (!"n".equals(B) && !"h".equals(B) && !"neither".equals(B)) {
                        JOptionPane.showMessageDialog(null, "please answer 'n' or 'h' or 'neither'");
                    }
                } while (!"n".equals(B) && !"h".equals(B) && !"neither".equals(B));
                switch (B) {
                    case "n":
                        do {
                            C = JOptionPane.showInputDialog("Do you prefer lots of blood or very little?(Answer lot or little)");
                            if (!"lot".equals(C) && !"little".equals(C)) {
                                JOptionPane.showMessageDialog(null, "please answer 'lot' or 'little'");
                            }
                        } while (!"lot".equals(C) && !"little".equals(C));
                        if ("little".equals(C)) {
                            Anime n = new NarutoAnime();
                            JOptionPane.showMessageDialog(null, n.getname() + " which is a " + n.getdescription(), "You Got Naruto", JOptionPane.INFORMATION_MESSAGE, Nar);
                        } else if ("lot".equals(C)) {
                            Anime ns = new NinjaScroll();
                            JOptionPane.showMessageDialog(null, ns.getname() + " which is a " + ns.getdescription(), "You Got Ninja Scroll", JOptionPane.INFORMATION_MESSAGE, NJ);
                        }
                        break;
                    case "h":
                        do {
                            D = JOptionPane.showInputDialog("Would you prefer a superhero show more for children or more for adults?(Please answer c or a)");
                            if (!"c".equals(D) && !"a".equals(D)) {
                                JOptionPane.showMessageDialog(null, "please answer 'c' or 'a'");
                            }
                        } while (!"c".equals(D) && !"a".equals(D));
                        if ("c".equals(D)) {
                            Anime h = new MHAAnime();
                            JOptionPane.showMessageDialog(null, h.getname() + " which is a " + h.getdescription(), "You Got My Hero Academia", JOptionPane.INFORMATION_MESSAGE, MH);
                        } else if ("a".equals(D)) {
                            Anime op = new OnePunchMan();
                            JOptionPane.showMessageDialog(null, op.getname() + " which is a " + op.getdescription(), "You Got One Punch Man", JOptionPane.INFORMATION_MESSAGE, OP);
                        }
                        break;
                    default:
                        Anime dz = new DragonBall();
                        JOptionPane.showMessageDialog(null, dz.getname() + " which is a " + dz.getdescription(), "You Got Dragon Ball Z", JOptionPane.INFORMATION_MESSAGE, DZ);
                        break;
                }
            } else if ("r".equals(A)) {
                do {
                    E = JOptionPane.showInputDialog("Are you more into Samurai or Sci-fi?(Please answer with either s or sf or neither");
                    if (!"s".equals(E) && !"sf".equals(E) && !"neither".equals(E)){
                        JOptionPane.showMessageDialog(null, "please answer 's' or 'sf' or 'neither'");
                    }
                } while (!"s".equals(E) && !"sf".equals(E) && !"neither".equals(E));

                switch (E) {
                    case "s":
                        Anime i = new Inuyasha();
                        JOptionPane.showMessageDialog(null, i.getname() + " which is a " + i.getdescription(), "You Got InuYasha", JOptionPane.INFORMATION_MESSAGE, IN);
                        break;
                    case "sf":
                        Anime so = new SwordArtOnline();
                        JOptionPane.showMessageDialog(null, so.getname() + " which is a " + so.getdescription(), "You Got Sword Art Online", JOptionPane.INFORMATION_MESSAGE, SAO);
                        break;
                    default:
                        Anime hc = new HowlsMovingCastle();
                        JOptionPane.showMessageDialog(null, hc.getname() + " which is a " + hc.getdescription(), "You Got Howls Moving Castle", JOptionPane.INFORMATION_MESSAGE, HC);
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "More suggestions coming in 2.0 :)");
            }

            Z = JOptionPane.showInputDialog("Do you wanna try again?)");
        } while ("Yes".equals(Z) || "yes".equals(Z) || "y".equals(Z));
        JOptionPane.showMessageDialog(null, "Thanks for using Dante's Anime Suggestor");
    }
}
