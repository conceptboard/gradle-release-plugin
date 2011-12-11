package no.entitas.gradle.svn;

import java.util.logging.Level;

import org.gradle.api.Project;
import org.tmatesoft.svn.core.internal.util.DefaultSVNDebugLogger;
import org.tmatesoft.svn.util.SVNLogType;

public class NullSVNDebugLog extends DefaultSVNDebugLogger {
    Project project;
            
    public NullSVNDebugLog(Project project) {
        this.project = project;
    }

    public void logError(SVNLogType logType, String message) {
        project.getLogger().error("ERROR: "+message);
    }
    
    public void logError(SVNLogType logType, Throwable th){
        th.printStackTrace();        
    };

    public void logSevere(SVNLogType logType, String message){
        project.getLogger().error("SEVERE: "+message);
    };

    public void logSevere(SVNLogType logType, Throwable th){
        th.printStackTrace();
    };

    public void logFine(SVNLogType logType, Throwable th){};

    public void logFine(SVNLogType logType, String message){};

    public void logFiner(SVNLogType logType, Throwable th){};

    public void logFiner(SVNLogType logType, String message){};

    public void logFinest(SVNLogType logType, Throwable th){};

    public void logFinest(SVNLogType logType, String message){};
    
    public void log(SVNLogType logType, Throwable th, Level logLevel){};
    
    public void log(SVNLogType logType, String message, Level logLevel){};
    
    public void log(SVNLogType logType, String message, byte[] data){};
}
