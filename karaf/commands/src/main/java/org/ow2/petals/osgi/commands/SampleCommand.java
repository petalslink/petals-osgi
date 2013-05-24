package org.ow2.petals.osgi.commands;

import com.google.common.annotations.VisibleForTesting;
import org.apache.felix.gogo.commands.Command;
import org.apache.felix.gogo.commands.Option;
import org.apache.karaf.shell.console.OsgiCommandSupport;

import static com.google.common.base.Preconditions.checkNotNull;

@Command(scope = "petals", name = "sample", description = "This is a sample command")
public class SampleCommand extends OsgiCommandSupport {

    @Option(name = "--id", description = "Service ID", required = true)
    protected String id;

    public SampleCommand() {
    }

    @Override
    protected Object doExecute() throws Exception {
        return String.format("Sample command result %s", id);
    }

    @VisibleForTesting
    void setId(String id) {
        this.id = checkNotNull(id, "id is null");
    }
}
