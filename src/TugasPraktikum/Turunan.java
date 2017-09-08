/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Umi Tiara
 */
public class Turunan extends Induk{
    public void test(String s)
    {
        System.out.println("Method Overload di dalam kelas turunan");
        System.out.println("s:\""+s+"\"");
    }
    public void test()
    {
        System.out.println("Method Override fi Dalam kelas Turunan");
    }
}
