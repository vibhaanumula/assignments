/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author haasinivishal
 */
@Stateless
@LocalBean
public class HelloWorld {

public String getHello(String name){
    return"Hello"+name;
}

}
