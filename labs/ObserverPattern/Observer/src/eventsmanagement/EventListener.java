/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsmanagement;

import java.io.File;

/**
 *
 * @author FA22-BSE-068
 */
public interface EventListener {
    void update(String eventType, File file);
}