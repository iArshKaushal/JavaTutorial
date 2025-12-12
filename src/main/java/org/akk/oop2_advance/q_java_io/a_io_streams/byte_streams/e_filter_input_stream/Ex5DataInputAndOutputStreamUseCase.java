package org.akk.oop2_advance.q_java_io.a_io_streams.byte_streams.e_filter_input_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import static org.akk.zz_utils.FilePaths.ROOT_FILE_PATH;


public class Ex5DataInputAndOutputStreamUseCase {

    public static void main(String[] args) {

        ///  Writing data using DataOutputStream
        SaveGameState saveGameState = new SaveGameState("Ashwani Kumar", 135, 35445, 85.5);
        saveGameState.saveStats();

        ///  Reading data using DataInputStream
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(ROOT_FILE_PATH + "gamestat.dt"));

            String playerName = dis.readUTF();
            int level = dis.readInt();
            int score = dis.readInt();
            double health = dis.readDouble();

            System.out.println("PLAYER NAME: " + playerName);
            System.out.println("LEVEL: " + level);
            System.out.println("SCORE: " + score);
            System.out.println("HEALTH: " + health);
            dis.close();
        } catch (Exception e) {
        }
    }

}


class SaveGameState {

    private String playerName;
    private int level;
    private int score;
    private double health;

    public SaveGameState(String playerName, int level, int score, double health) {
        this.playerName = playerName;
        this.level = level;
        this.score = score;
        this.health = health;
    }

    public void saveStats(){
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(ROOT_FILE_PATH + "gamestat.dt"));
            dos.writeUTF(playerName);
            dos.writeInt(level);
            dos.writeInt(score);
            dos.writeDouble(health);
            dos.close();
        } catch (Exception e) {
        }
    }

}