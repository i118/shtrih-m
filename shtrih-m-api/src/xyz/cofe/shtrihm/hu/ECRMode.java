/*
 * The MIT License
 *
 * Copyright 2017 Kamnev Georgiy <nt.gocha@gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package xyz.cofe.shtrihm.hu;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Режим ККМ
 * @author nt.gocha@gmail.com
 */
public class ECRMode {
    //<editor-fold defaultstate="collapsed" desc="log Функции">
    private static final Logger logger = Logger.getLogger(ECRMode.class.getName());
    
    private static Level logLevel(){ return logger.getLevel(); }
    private static boolean isLogSevere(){
        Level ll = logLevel();
        return ll == null
            ? true
            : ll.intValue() <= Level.SEVERE.intValue();
    }
    private static boolean isLogWarning(){
        Level ll = logLevel();
        return ll == null
            ? true
            : ll.intValue() <= Level.WARNING.intValue();
    }
    private static boolean isLogInfo(){
        Level ll = logLevel();
        return ll == null
            ? true
            : ll.intValue() <= Level.INFO.intValue();
    }
    private static boolean isLogFine(){
        Level ll = logLevel();
        return ll == null
            ? true
            : ll.intValue() <= Level.FINE.intValue();
    }
    private static boolean isLogFiner(){
        Level ll = logLevel();
        return ll == null
            ? false
            : ll.intValue() <= Level.FINER.intValue();
    }
    private static boolean isLogFinest(){
        Level ll = logLevel();
        return ll == null
            ? false
            : ll.intValue() <= Level.FINEST.intValue();
    }
    
    private static void logEntering(String method,Object ... args){
        logger.entering(ECRMode.class.getName(), method, args);
    }
    private static void logExiting(String method,Object result){
        logger.exiting(ECRMode.class.getName(), method, result);
    }
    
    private static void logFine(String message,Object ... args){
        logger.log(Level.FINE, message, args);
    }
    private static void logFiner(String message,Object ... args){
        logger.log(Level.FINER, message, args);
    }
    private static void logFinest(String message,Object ... args){
        logger.log(Level.FINEST, message, args);
    }
    private static void logInfo(String message,Object ... args){
        logger.log(Level.INFO, message, args);
    }
    private static void logWarning(String message,Object ... args){
        logger.log(Level.WARNING, message, args);
    }
    private static void logSevere(String message,Object ... args){
        logger.log(Level.SEVERE, message, args);
    }
    private static void logException(Throwable ex){
        logger.log(Level.SEVERE, null, ex);
    }    
    //</editor-fold>
    
    public ECRMode(int mode, 
                   int mode8Status, 
                   String description,
                   int advancedMode,
                   String advancedModeDescription
    ){
        this.mode = mode;
        this.mode8Status = mode8Status;
        this.description = description;
        this.advancedMode = advancedMode;
        this.advancedModeDescription = advancedModeDescription;
    }
    
    public final int mode;
    public final int mode8Status;
    public final String description;
    public final int advancedMode;
    public final String advancedModeDescription;

    public int getMode() {
        return mode;
    }

    public int getMode8Status() {
        return mode8Status;
    }

    public String getDescription() {
        return description;
    }
    
    public int getAdvancedMode(){
        return advancedMode;
    }

    public String getAdvancedModeDescription() {
        return advancedModeDescription;
    }

    @Override
    public String toString() {
        return "ECRMode{" + "mode=" + mode + ", mode8Status=" + mode8Status + ", description=" + description +
               ", advancedMode=" + advancedMode + ", advancedModeDescription=" + advancedModeDescription + '}';
    }
}
