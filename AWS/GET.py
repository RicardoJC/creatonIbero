import json
import boto3

dynamodb = boto3.client('dynamodb')

def lambda_handler(event, context):
    data = event
    return {
        'statusCode': 200,
        'body': json.dumps(dynamodb.get_item(TableName='notes', Key={'id':{'S':data['id']}}))
    }

