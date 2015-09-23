package sagex.miniclient;

import java.io.Serializable;

/**
 * Created by seans on 20/09/15.
 */
public class ServerInfo implements Serializable, Comparable<ServerInfo> {
    public String address;
    public int port;
    public String name;
    public String locatorID;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ServerInfo{");
        sb.append("address='").append(address).append('\'');
        sb.append(", port=").append(port);
        sb.append(", name='").append(name).append('\'');
        sb.append(", locatorID='").append(locatorID).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServerInfo that = (ServerInfo) o;

        if (port != that.port) return false;
        return address.equals(that.address);

    }

    @Override
    public int hashCode() {
        int result = address.hashCode();
        result = 31 * result + port;
        return result;
    }

    @Override
    public int compareTo(ServerInfo o) {
        if (address==null && o.address==null) return 0;
        if (o.address==null && address!=null) return -1;
        return address.compareTo(o.address);
    }
}