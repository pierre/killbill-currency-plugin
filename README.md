# killbill-currency-plugin

A default currency plugin based on a set of static currency conversion tables.

## Kill Bill compatibility

| Plugin version | Kill Bill version |
|---------------:|------------------:|
|          0.0.y |            0.24.z |

## Requirements

The plugin needs a database. The latest version of the schema can be found [here](https://github.com/killbill/killbill-currency-plugin/blob/master/src/main/resources/ddl.sql).

## Development

To install the plugin from sources:

```
kpm install_java_plugin currency --from-source-file target/currency-*-SNAPSHOT.jar --destination /var/tmp/bundles
```

## REST API

To add currency conversion rates for a given base currency and date:

```
curl -v \
     -X POST \
     -u admin:password \
     -H 'X-Killbill-ApiKey: bob' \
     -H 'X-Killbill-ApiSecret: lazar' \
     -H 'X-Killbill-CreatedBy: admin' \
     -H 'Content-Type: application/json' \
     -d '{"baseCurrency":"USD","conversionDate":"2013-10-10T20:41:09Z","rates":{"BRL":"0.45721","EUR":"1.38045","GBP":"1.61650"}}' \
     http://127.0.0.1:8080/plugins/killbill-currency/rates
```

To get all current rates for a given base currency:

```
curl -v \
     -u admin:password \
     -H 'X-Killbill-ApiKey: bob' \
     -H 'X-Killbill-ApiSecret: lazar' \
     'http://127.0.0.1:8080/plugins/killbill-currency/rates?baseCurrency=USD'
```

## About

Kill Bill is the leading Open-Source Subscription Billing & Payments Platform. For more information about the project, go to https://killbill.io/.
