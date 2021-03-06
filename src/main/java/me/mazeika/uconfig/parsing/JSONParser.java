package me.mazeika.uconfig.parsing;

import org.yaml.snakeyaml.Yaml;

class JSONParser extends Parser
{
    private static final Yaml yaml = new Yaml();

    @Override
    public Object parse(String input)
    {
        return yaml.load(input);
    }

    @Override
    public ParserType getType()
    {
        return ParserType.JSON;
    }
}
