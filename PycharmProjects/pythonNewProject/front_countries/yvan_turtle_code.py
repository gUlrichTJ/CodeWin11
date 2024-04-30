import socket

def scan_ports(ip, start_port, end_port):
    open_ports = []

    for port in range(start_port, end_port + 1):
        sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        sock.settimeout(1)

        result = sock.connect_ex((ip, port))

        if result == 0:
            open_ports.append(port)

        sock.close()

    return open_ports

if __name__ == "__main__":
    target_ip = "10.176.0.1"  # Remplacez par l'adresse IP du réseau que vous avez la permission de balayer
    start_port = 1
    end_port = 1024

    open_ports = scan_ports(target_ip, start_port, end_port)

    if open_ports:
        print(f"Ports ouverts sur {target_ip}: {open_ports}")
    else:
        print(f"Aucun port ouvert trouvé sur {target_ip}")
