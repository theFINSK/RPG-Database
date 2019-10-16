package rpg.test;
// Generated by ComTest BEGIN
import java.io.*;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import rpg.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2019.05.03 22:48:11 // Generated by ComTest
 *
 */
@SuppressWarnings("all")
public class EsineetTest {



  // Generated by ComTest BEGIN
  /** 
   * testLueTiedostosta86 
   * @throws SailoException when error
   */
  @Test
  public void testLueTiedostosta86() throws SailoException {    // Esineet: 86
    Esineet harrasteet = new Esineet(); 
    Esine miekka = new Esine(); miekka.taytaMiekka(); 
    Esine kirves = new Esine(); kirves.taytaMiekka(); 
    String tiedNimi = "testikelmit"; 
    File ftied = new File(tiedNimi+".dat"); 
    ftied.delete(); 
    try {
    harrasteet.lueTiedostosta(tiedNimi); 
    fail("Esineet: 96 Did not throw SailoException");
    } catch(SailoException _e_){ _e_.getMessage(); }
    harrasteet.lisaa(kirves); 
    harrasteet.lisaa(miekka); 
    harrasteet.tallenna(); 
    harrasteet = new Esineet(); 
    harrasteet.lueTiedostosta(tiedNimi); 
    Iterator<Esine> i = harrasteet.iterator(); 
    assertEquals("From: Esineet line: 103", miekka.toString(), i.next().toString()); 
    assertEquals("From: Esineet line: 104", true, i.hasNext()); 
    harrasteet.lisaa(miekka); 
    harrasteet.lisaa(kirves); 
    harrasteet.tallenna(); 
    assertEquals("From: Esineet line: 108", true, ftied.delete()); 
    File fbak = new File(tiedNimi+".bak"); 
    assertEquals("From: Esineet line: 110", true, fbak.delete()); 
  } // Generated by ComTest END
}