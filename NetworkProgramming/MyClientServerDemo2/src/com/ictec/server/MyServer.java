package com.ictec.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketImpl;
import java.util.Random;
import java.util.Scanner;

public class MyServer {
    public static void main(String[] args) {
        try {
            //create server
            ServerSocket myServerSocket = new ServerSocket(50505);
            System.out.println("Waiting for Client");
            //wait for client
            Socket myClient =  myServerSocket.accept();
            System.out.println("Client Connected");
            DataInputStream dis = new DataInputStream(myClient.getInputStream());
            DataOutputStream dos = new DataOutputStream(myClient.getOutputStream());
            final String[] quotes = {"Success is not final; failure is not fatal: It is the courage to continue that counts." ,
                    "It is better to fail in originality than to succeed in imitation." ,
                    "The road to success and the road to failure are almost exactly the same." ,
                    "Success usually comes to those who are too busy looking for it.",
                    "Develop success from failures. Discouragement and failure are two of the surest stepping stones to success." ,
                    "Nothing in the world can take the place of Persistence. Talent will not; nothing is more common than unsuccessful men with talent. Genius will not; unrewarded genius is almost a proverb. Education will not; the world is full of educated derelicts. The slogan 'Press On' has solved and always will solve the problems of the human race.",
                    "There are three ways to ultimate success: The first way is to be kind. The second way is to be kind. The third way is to be kind.", "Success is peace of mind, which is a direct result of self-satisfaction in knowing you made the effort to become the best of which you are capable.",
                    "I never dreamed about success. I worked for it." ,
                    "Success is getting what you want, happiness is wanting what you get.",
                    "Believe you can and you're halfway there. -Theodore Roosevelt",
                    "Act as if what you do makes a difference. It does. -William James",
                    "Success is not final, failure is not fatal: it is the courage to continue that counts. -Winston Churchill",
                    "The only way to do great work is to love what you do. -Steve Jobs",
                    "Don't watch the clock; do what it does. Keep going. -Sam Levenson",
                    "I have not failed. I've just found 10,000 ways that won't work. -Thomas A. Edison",
                    "Success is stumbling from failure to failure with no loss of enthusiasm. -Winston S. Churchill",
                    "It does not matter how slowly you go as long as you do not stop. -Confucius",
                    "Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work. And the only way to do great work is to love what you do. If you haven't found it yet, keep looking. Don't settle. As with all matters of the heart, you'll know when you find it. -Steve Jobs",
                    "You are never too old to set another goal or to dream a new dream. -C.S. Lewis",
                    "Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle. -Christian D. Larson",
                    "If you want to achieve greatness stop asking for permission. -Anonymous",
                    "Do not wait to strike till the iron is hot; but make it hot by striking. -William B. Sprague",
                    "We may encounter many defeats but we must not be defeated. -Maya Angelou",
                    "Knowing is not enough; we must apply. Willing is not enough; we must do. -Johann Wolfgang von Goethe",
                    "I attribute my success to this: I never gave or took any excuse. -Florence Nightingale",
                    "The only person you are destined to become is the person you decide to be. -Ralph Waldo Emerson",
                    "You miss 100% of the shots you don't take. -Wayne Gretzky",
                    "The best way to predict the future is to create it. -Peter Drucker",
                    "You must be the change you wish to see in the world. -Mahatma Gandhi",
                    "You can't use up creativity. The more you use, the more you have. -Maya Angelou",
                    "The starting point of all achievement is desire. -Napoleon Hill",
                    "Don't let yesterday take up too much of today. -Will Rogers",
                    "If you do what you always did, you will get what you always got. -Anonymous",
                    "What you get by achieving your goals is not as important as what you become by achieving your goals. -Zig Ziglar",
                    "The only limit to our realization of tomorrow will be our doubts of today. -Franklin D. Roosevelt",
                    "If you are not willing to risk the usual, you will have to settle for the ordinary. -Jim Rohn",
                    "If you really look closely, most overnight successes took a long time. -Steve Jobs",
                    "The future belongs to those who believe in the beauty of their dreams. -Eleanor Roosevelt",
                    "Believe and act as if it were impossible to fail. -Charles Kettering"};
            while (true){
                //assigning massage to string
                String msg = dis.readUTF();
                //print massage
                System.out.println("The massage from the client : "+ msg);
                if(msg.equalsIgnoreCase("bye")){
                    String reply = "bye";
                    dos.writeUTF(reply);
                    dos.flush();
                    dos.close();
                    myClient.close();
                    break;
                } else if (msg.equalsIgnoreCase("Hello")) {
                    dos.writeUTF(msg);
                    dos.flush();
                } else if (msg.equalsIgnoreCase("get")) {
                    Random random = new Random();
                    int index = random.nextInt(quotes.length);
                    dos.writeUTF(quotes[index]);
                }else {
                    String reply = "Sorry, I didn't understand that.";
                    dos.writeUTF(reply);
                    dos.flush();
                }

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
