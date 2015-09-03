/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.arsw.aop;

import org.aspectj.lang.JoinPoint;

public class AuditAspect {

    public void auditBefore(JoinPoint jp) {
        System.out.print(jp.getSignature().getName());
        System.out.print("(");
        boolean start = true;
        for(Object x : jp.getArgs()) {
            if (start) {
                start = false;
            } else {
                System.out.print(", ");                
            }
            System.out.print(x);
        }
        System.out.println(")");
    }
    
    public void auditAfter(JoinPoint jp,Object retValue) {
        System.out.print(jp.getSignature().getName());        
        System.out.println(": ["+retValue.getClass().getCanonicalName()+"] ");
    }
}
