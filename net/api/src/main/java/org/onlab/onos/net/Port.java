package org.onlab.onos.net;

/**
 * Abstraction of a network port.
 */
public interface Port {

    /**
     * Returns the port number.
     *
     * @return port number
     */
    PortNumber number();

    /**
     * Indicates whether or not the port is currently up and active.
     *
     * @return true if the port is operational
     */
    boolean isEnabled();

    /**
     * Returns the identifier of the network element to which this port belongs.
     *
     * @return parent network element
     */
    Element parent();

    // set of port attributes

}
