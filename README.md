# Medga
A work-in-progress game

# Dependencies
- Jdk11
- Sbt
- Node

For reproducibility with dependencies, install and enter in Nix environment with `nix-shell shell.nix`

# Install
- `npm install`

# Generate Js from Scala
- `sbt fastLinkJS` map scala to js in `target/scala-2.13/medga-fastopt` directory

# Run
Open `./index.html` in your browser
