{
  nixpkgs = fetchTarball {
    name   = "nixos-unstable";
    url    = "https://github.com/NixOS/nixpkgs/archive/17b101e29dff.tar.gz";
    sha256 = "142lbns0qxl9c6gz035c07v9gpsfd29absqvpd539iz898bdlc48";
  };
}
