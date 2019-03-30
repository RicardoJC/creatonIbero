import json
import boto3
import re

dynamodb = boto3.client('dynamodb')

def lambda_handler(event, context):
    
    regex = 'si (no|me|le|nos) (.*?) me (\w)*'
    
    
    etiquetado = re.sub()
    
    dynamodb.put_item(TableName='notes', Item={'id':{'S':event['id']},'etiqueta':{'S':'KAFNJKRE'},'texto':{'S':'hola mundo'},})
    return {
        'statusCode': 200,
    }

